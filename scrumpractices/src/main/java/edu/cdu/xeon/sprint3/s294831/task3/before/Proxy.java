package edu.cdu.xeon.sprint3.s294831.task3.before;

public class Proxy {
  
class Numbers
{
int n_id;
static int n_next;
public:
Numbers()
{
n_id = n_next++;
cout << " $$ ctor: " << m_id << '\n';
}
~numbers()
{
cout << " dtor: " << m_id << '\n';
}
void increments ()
{
cout << "Number Increment " << n_id << '\n';
}
};
int Numbers ::n_next = 1;

int main()
{
Int Numbers[5];

for (int i; true;)
{
cout << "Exit[0], Numbers [1-5]: ";
cin >> i;
if (i == 0)
break;
Numbers[i - 1].print();
}
}

