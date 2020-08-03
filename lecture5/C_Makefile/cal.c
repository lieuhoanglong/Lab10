#include <stdio.h>
#include <math.h>

float standard_deviation(float *data)
{
	float sum = 0.0, mean, SD = 0.0;
	int i;
	for (i = 0; i < 10; ++i) {
		sum += data[i];
	}
	mean = sum / 10;
	for (i = 0; i < 10; ++i)
		SD += pow(data[i] - mean, 2);
	return sqrt(SD / 10);
}

float average(float *data)
{
	float sum = 0.0, mean;
	int i;
	for (i = 0; i < 10; ++i) {
		sum += data[i];
	}
	mean = sum / 10;
	return mean;
}
