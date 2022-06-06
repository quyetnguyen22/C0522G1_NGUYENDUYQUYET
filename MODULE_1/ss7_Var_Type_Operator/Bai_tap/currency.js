function convert() {
    let a=document.getElementById('amount').value;
    let f=document.getElementById('from').value;
    let t=document.getElementById('to').value;
    let result;

    if (f=="usd" && t=="vnd"){
        result=+a*23000+'vnd';
    }
    else if (f=='vnd' && t=='usd'){
        result=+a/23000+'$';
    }
    else if (f=='vnd'){
        result= a+'vnd';
    }
    else {
        result=a+'$';
    }
document.getElementById('result').innerText=result;

}