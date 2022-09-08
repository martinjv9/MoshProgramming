#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    string street;
    cout << "Enter your Street Name: ";
    getline(cin, street);

    string city;
    cout << "Enter your City: ";
    getline(cin, city);

    string state;
    cout << "Enter your State: ";
    getline(cin, state);

    string zipcode;
    cout << "Enter your Zipcode: ";
    getline(cin, zipcode);

    cout << street << endl
         << city << ", " << state << ", " << zipcode << endl;

    return 0;
}
