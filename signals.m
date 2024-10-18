% Define the time range
t = -5:0.01:5;  % Time from -5 to 5 with small increments

% Use the built-in heaviside function
u_t = heaviside(t);

% Plot the unit step function
figure;
plot(t, u_t, 'LineWidth', 2);
title('Unit Step Function (Heaviside Function)');
xlabel('Time (t)');
ylabel('u(t)');
grid on;
