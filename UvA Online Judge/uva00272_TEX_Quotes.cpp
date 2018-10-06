#include <iostream>
#include <string>

using namespace std;

int main()
{
	bool inquote = false;
	char ch;
	while (cin.get(ch))
	{
		if (ch == '\"' and not inquote)
		{
			inquote = true;
			cout << "``";
		}
		else if (ch == '\"' and inquote)
		{
			inquote = false;
			cout << "''";
		}
		else
		{
			cout << ch;
		}
	}
	
	return 0;
}
// g++ 272_TEX_Quotes.cpp

/*
Sample Input

"To be or not to be," quoth the Bard, "that
is the question".
The programming contestant replied: "I must disagree.
To `C' or not to `C', that is The Question!"

Sample Output

``To be or not to be,'' quoth the Bard, ``that
is the question''.
The programming contestant replied: ``I must disagree.
To `C' or not to `C', that is The Question!''

*/