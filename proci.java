public class proci {

    private double freq;
    private int cores;

    public proci(String spec) {
        String[] parts = spec.split(" ");
        this.freq = Double.parseDouble(parts[0]);
        this.cores = Integer.parseInt(parts[1]);
    }

    public double getPerformanceScore() {
        return freq * cores;
    }

    public boolean isHighPerformance() {
        return cores >= 6 && freq >= 3.5;
    }

    public int compare(proci cpu) {
        if (this.getPerformanceScore() > cpu.getPerformanceScore()) {
            return 1;
        } else if (this.getPerformanceScore() < cpu.getPerformanceScore()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override

    public String toString() {
        return "Processor(" + freq + "GHz, " + cores + " cores)";
    }

}
