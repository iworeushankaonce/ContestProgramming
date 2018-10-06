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
	cout << "PERFECTION OUTPUT" << endl;
	int a;
	vector<int> res;
	vector<string> name;
	while(cin >> a)
	{
		if(a == 0)
			break;
	
		vector<int> v;
		for (int i = 1; i < a; i++)
		{
			if(a % i == 0)
			{
				v.push_back(i);
			}
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++)
		{
			sum += v[i];
		}
		res.push_back(a);
		string s;
		if(sum == a)
			s = "PERFECT";
		else if (sum < a)
			s = "DEFICIENT";
		else if (sum > a)
			s = "ABUNDANT";
		name.push_back(s);
	}
	vector<int>::iterator ma = max_element(res.begin(), res.end());
	int m = *ma;
	//cout << m << endl;
	
	int w = to_string(m).size();
	for (int i = 0; i < res.size(); i++)
	{
		cout << setw(w) << res[i] << "  " << name[i] << endl;
	}
	cout << "END OF OUTPUT" << endl;
	
	return 0;
}
// g++ -std=c++11 382_Perfection.cpp

/*

15 28 6 56 60000 22 496 0
Sample Output

PERFECTION OUTPUT
   15  DEFICIENT
   28  PERFECT
    6  PERFECT
   56  ABUNDANT
60000  ABUNDANT
   22  DEFICIENT
  496  PERFECT
END OF OUTPUT

*/
