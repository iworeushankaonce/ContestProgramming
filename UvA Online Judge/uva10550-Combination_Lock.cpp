#include <iostream>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

int func(int x, int y, int dir)
{
	int counter = 0;
	if (dir == 1)
	{
		while (x != y)
		{
			x++;
			if(x == 40)
			{
				x = 0;
			}
			counter++;
		}
	}
	else
	{
		while (x != y)
		{
			x--;
			if(x == -1)
			{
				x = 39;
			}
			counter++;
		}
	}
	
	return counter;
}

int main()
{
	int n, a, b, c;
	while(cin >> n >> a >> b >> c)
	{
		if (n == 0 and a == 0 and b == 0 and c == 0)
		{
			break;
		}
		int sum = 0;
		sum += 720;
		sum += 9 * func(n, a, 0);
		sum += 360;
		sum += 9 * func(a, b, 1);
		sum += 9 * func(b, c, 0);
		cout << sum << endl;
	}
	
	return 0;
}
// g++ -std=c++11 10550-Combination_Lock.cpp

/*

0 30 0 30
5 35 5 35
0 20 0 20
7 27 7 27
0 10 0 10
9 19 9 19
0 0 0 0
Sample Output
1350
1350
1620
1620
1890
1890

*/