#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    string names[3];

    cout << "Name: ";
    getline(cin, names[0]);

    cout << "Name: ";
    getline(cin, names[1]);

    cout << "Name: ";
    getline(cin, names[2]);

    cout << "The first name is: " << names[0];
    return 0;
}
