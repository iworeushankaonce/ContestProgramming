#include <iostream>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

int main()
{
	long long a; cin >> a;
	long long b; cin >> b;
	while( true )
	{
		if ( a == 0 and b == 0 )
			break;
		if (b > a)
			swap(a, b);
		int carry = 0;
		bool add = false;
		while(a > 0 or b > 0)
		{
			int d1 = a % 10;
			a /= 10;
			int d2 = b % 10;
			b /= 10;
			if(add)
			{
				d2++;
				add = false;
			}
			
			if (d1 + d2 >= 10)
			{
				carry++;
				add = true;
			}
//			cout << "carry = " << carry << " a = " << a << " b = " << b << endl;
		}
		if(carry == 0)
			cout << "No carry operation." << endl;
		else if (carry == 1)
			cout << "1 carry operation." << endl;
		else
			cout << carry << " carry operations." << endl;
			
		cin >> a;
		cin >> b;
	}
	
	return 0;
}
// g++ -std=c++11 10035-Primary_Arithmetic.cpp

/*

123 456
555 555
123 594
0 0

Sample Output

No carry operation.
3 carry operations.
1 carry operation.

*/
