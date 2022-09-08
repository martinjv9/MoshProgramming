#include <iostream>
#include <iomanip>

using namespace std;

int main(int argc, char const *argv[])
{
    cout << left;
    cout << setw(10) << "Spring" << setw(10) << "Nice" << endl
         << setw(10) << "Summer" << setw(10) << "Hot" << endl;

    cout << fixed << setprecision(2) << 12.34567;
    return 0;
}
