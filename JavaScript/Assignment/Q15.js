let i , j;

let Number = "";

for(i = 5; i >=1;i--)
{
    for(j=1; j<=i ;j++)
    {
        Number = Number+ " *";

    }
    console.log(Number);
    Number ="";
}