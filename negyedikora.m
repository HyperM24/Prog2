
t = linspace(0,2);
x = t - 1;
A = 2;
ph = pi/4;
f = 2; 
y = A * sin(2*pi*f*t+ph);                                                 

subplot(2,2,1);
plot(t,y,'r');

hold on

plot(t,x,'b');
ylim([-3,3]);
xlim([0,2]);

grid on

subplot(2,2,2);
plot(t,y,'r');
hold on

plot(t,x,'b');
hold on
ylim([-3,4]);
xlim([0,2]);

grid on
hold on


subplot(2,2,3);
ts = 0:0.001:2;
xs = A*sin(2*pi*ts+ph);

xm8 = 8;
xm4 = 16;
xm5 = 32;

for i=1:16
    xs(i) = xs(i)-(mod(xs(i)*xm8,1))/8
end

stem(ts,xs,LineStyle="none");
hold on

subplot(2,2,4);

for i=1:16
    xs(i) = xs(i)-(mod(xs(i)*xm5,1))/8
end

stem(ts,xs,LineStyle="none", Color='g');
hold on






