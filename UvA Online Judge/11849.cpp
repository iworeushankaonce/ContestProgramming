#include<iostream>
#include<unordered_set>

using namespace std;

int main()
{
	int n,m;
	while(cin >> n >> m)
	{
		if(n == 0 and m == 0) break;
		unordered_set<int> uset;
		int cdCounter = 0;
		int temp;
		for( ; n > 0; --n)
		{
			cin >> temp;
			uset.insert(temp);
		}
		for( ; m > 0; --m)
		{
			cin >> temp;
			if(uset.insert(temp).second == false) ++cdCounter;
		}
		cout << cdCounter << endl;
	}
	return 0;
}