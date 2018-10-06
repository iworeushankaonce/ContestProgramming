#include<set>
#include<vector>
#include <cstdio>

using namespace std;

int main()
{
	int n;
	cin >> n;
	set<int> happyNumbers;
	for(int i = 0; i <n; ++i)
	{
		int num; cin >> num;
		int temp = num;
		bool isHappy = true;
		vector<int> numbers;
		if(happyNumbers.find(num) != happyNumbers.end()) goto endLab;
		isHappy = false;
		while(isHappy == false)
		{
			int sum = 0;
			while(temp != 0)
			{
				int digit = temp % 10;
				sum += digit * digit;
				temp /= 10;
			}
			numbers.push_back(sum);
			temp = sum;

			if(temp == 1 or temp == 7)
			{
				isHappy = true;
				break;
			}
			else if(temp == num or temp <= 9 ) break;
		}
	
	endLab:
		if(isHappy)
		{
			cout << "Case #" << i +1 << ": " << num <<" is a Happy number." << endl;
			for(int i = 0; i < numbers.size(); ++i) happyNumbers.insert(numbers[i]);
		}
		else cout << "Case #" << i +1 << ": " << num <<" is an Unhappy number." << endl;
		numbers.clear();
	}
	return 0;
}