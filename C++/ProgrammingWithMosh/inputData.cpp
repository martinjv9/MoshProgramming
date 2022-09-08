#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    cout << "Fahrenheit: ";
    double tempF;
    cin >> tempF;
    double tempC;
    tempC = ((tempF - 32) * 5) / 9;
    cout << "Your temperature in Celcius is:" << tempC << endl;
    return 0;
}
