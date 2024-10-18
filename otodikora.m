A = 3;
f = 1.25;
ph = 8/4;
t = linspace(0,2);
x = (t-1).^2 + 1;

y = A * sin(2*pi*f*t+ph);

subplot(2,2,1);
plot(t,y,'g')
hold on
grid on

plot(t,x,'b')
hold on 

ylim([min(y),max(y)])
xlim([0,2])

subplot(2,2,2)
plot(t,x+y,'c')
grid on


subplot(2,2,3)
ts = 0:0.1:2;
xs = (ts-1).^2 + 1;
ys = A * sin(2*pi*f*ts+ph);
plot(t,x+y,'d')
hold on
grid on
stem(ts,xs+ys,LineStyle = "none")

subplot(2,2,4)
rangemin = -5;
rangemax = 5;

sums = xs + ys;
floor = (sums - rangemin)/((rangemax-rangemin)/2.^3).*((rangemax-rangemin)/2.^4) 
sumsh = sums - mod(sums*4,1)/4;

plot(ts,floor,"k")
ylim([-5,5])
grid on
hold on



