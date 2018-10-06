#include<iostream>
#include<unordered_map>
#include<sstream>
#include <cmath>

using namespace std;

bool is_comparison(const string& token) {
	return token==">" || token=="<" || token== ">=" || token == "<=" || token=="=";
}

bool compare(int percentage,int guess,const string& token) {
	if (token==">") return percentage > guess;
	else if (token=="<") return percentage < guess;
	else if (token==">=") return percentage >= guess;
	else if (token=="<=") return percentage <= guess;
	else if (token=="=") return percentage == guess;
	return false;
}

int main()
{
	int p,g;
	cin >> p >> g;
	unordered_map<string,int> votes;
	//считываем выборы
	for (int i = 0; i < p; ++i) 
	{
		string party;
		double percent;
		cin >> party >> percent;
		votes[party] = round(percent*10.0);
	}
	//считываем догадки
	cin.ignore();
	for (int i=0;i<g;++i) {
		string guess;
		getline(cin,guess);
		stringstream ss(guess);
		string token;
		int percentage=0;
		
		while (ss>>token) {
			if (token=="+") {} 
			else if (is_comparison(token)) 
			{
				int num;
				ss >> num;
				num *= 10;
				cout<<"Guess #"<<i+1<<" was ";
				if (!compare(percentage,num,token)) cout<<"in";
				cout<<"correct."<<endl;
				break;
			} else {
				percentage+=votes[token];
			}
		}
	}
	return 0;
}