#include "cal.h"

int main()
{
	float array[12];
	int i;
	printf("Enter 12 elements: ");
	for (i=0; i<12; i++)
	{
		scanf("%f", &array[i]);
	}
	printf("average is: %f\n", average(array));
	printf("standard deviation is: %f\n", standard_deviation(array));

}
