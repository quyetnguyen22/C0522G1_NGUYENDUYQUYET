function convert() {
    let amount=document.getElementById('amount').value;
    let from=document.getElementById('from').value;
    let to=document.getElementById('to').value;
    let result;

    if (from=="usd" && to=="vnd"){
        result=+amount*23000+'vnd';
    }
    else if (from=='vnd' && to=='usd'){
        result=+amount/23000+'$';
    }
    else if (from=='vnd'){
        result= amount+'vnd';
    }
    else {
        result=amount+'$';
    }
document.getElementById('result').innerText=result;

}