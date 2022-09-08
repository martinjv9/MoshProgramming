#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <iomanip>

using namespace std;
// one line comment

/* many
line comment
*/

int main(int argc, char const *argv[])
{
    cout << left;
    cout << setw(15) << "Course" << setw(10) << "Students" << endl
         << setw(15) << "C++" << right << setw(10) << 100 << endl
         << setw(15) << left << "JavaScript" << right << setw(10) << 50 << endl;

    cout << setw(15) << left << "Course" << setw(10) << "Students" << endl
         << setw(15) << "C++" << setw(10) << right << 100 << left << endl
         << setw(15) << "JavaScript" << setw(10) << right << 50 << left << endl;
    return 0;
}
