#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the twoTwo function below.
 */
int twoTwo(string a) {
    

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string a;
        getline(cin, a);

        int result = twoTwo(a);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
