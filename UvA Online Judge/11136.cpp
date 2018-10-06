#include<iostream>
#include<set>

using namespace std;

int main()
{
	int n;
	while(cin >> n)
	{
		if(n == 0) break;
		
		multiset<long long> bills;
		long long paid = 0;
		
		for( ;n>0; --n)
		{
			int numOfBills; cin >> numOfBills;
			long long bill;
			
			for( ;numOfBills > 0; --numOfBills)
			{
				cin >> bill;
				bills.insert(bill);
			}
			
			paid += (*(--bills.end()) - *(bills.begin()));
			bills.erase(bills.begin());
			bills.erase(--bills.end());
		}
		cout << paid << endl;
	}
	return 0;
}
