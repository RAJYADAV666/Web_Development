let Number =642;
let Ans =0;
let Sum =0;



while(Number !=0)
{
    Ans = Number % 10;
   Sum = Sum + Ans;
    Number = Number  /10;


}

console.log(Sum);