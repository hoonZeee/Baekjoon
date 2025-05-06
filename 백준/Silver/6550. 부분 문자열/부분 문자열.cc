#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s, t;

    while (cin >> s >> t)
    {

        int idx = 0;

        for (char c : t)
        {
            if (s[idx] == c)
                idx++;
            if (idx == s.length())
                break;
        }
        if(idx == s.length()) cout << "Yes" << endl;
            else cout << "No" << endl;
    }
}