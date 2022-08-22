#include "../include/fun.h"
#include "math.h"

double dist(double x1, double y1, double x2, double y2) {
    double a = fabs(x1-x2);
    double b = fabs(y1-y2);
    return sqrt(a * a + b * b);  // c*c = a*a + b*b
}
