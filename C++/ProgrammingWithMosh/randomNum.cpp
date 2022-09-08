#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main(int argc, char const *argv[])
{
    const short minValue = 1;
    const short maxValue = 6;

    srand(time(0));
    short dice1 = (rand() % (maxValue - minValue + 1)) + 1;
    short dice2 = (rand() % (maxValue - minValue + 1)) + 1;

    cout << dice1 << endl;
    cout << dice2 << endl;
    return 0;
}
