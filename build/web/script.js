function gerarHoroscopo(myform) {
    event.preventDefault();
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletGeraHoroscopo");
    var formData = new FormData(myform);
    const data = new URLSearchParams();
    
    for(const pair of formData)
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data);
    httpRequest.onreadystatechange = function () {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)
        {
            document.getElementById("answer-box").innerHTML = httpRequest.responseText;
        }
    };
}



function validaDados(myform){
    event.preventDefault();
    
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletVerificaDados");
    var formData = new FormData(myform);
    const data = new URLSearchParams();
    
    for(const pair of formData)
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data);
    httpRequest.onreadystatechange = function () {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)
        {
            document.getElementById("result").innerHTML = httpRequest.responseText;
            const valueTagP = $("#result").text().trim() == "Acessando..." ? window.location.href = "./horoscopo.jsp" : false;
        }
            
    };
}

function validaDadosFetch(myform)
{   
    event.preventDefault(); 
        
    const data = new URLSearchParams();

    for (const pair of new FormData(myform)) {
        data.append(pair[0], pair[1]);
    }
    fetch("ServletVerificaDados", {
        method: 'post',
        body: data
    }).then(function (response) {
        return response.text();
    }).then(function (text) {
        document.getElementById("result").innerHTML = text;
    }).catch(function (error) {
        console.error(error);
    });
}
