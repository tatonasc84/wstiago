
function exibirdash() {

    fetch("http://localhost:8080/Transactions/countAceito/" + localStorage.getItem("id_selecionado"))
        .then(res => res.json())
        .then(res => {
            document.getElementById("dados").innerHTML = "<br><h4>Aceito: " + res + "</h4>";
        })

    fetch("http://localhost:8080/Transactions/countRejeitado/" + localStorage.getItem("id_selecionado"))
        .then(res => res.json())
        .then(res => {
            document.getElementById("dados").innerHTML += "<br><h4>Rejeitado: " + res + "</h4>";
        })

    fetch("http://localhost:8080/Transactions/countFraude/" + localStorage.getItem("id_selecionado"))
    .then(res => res.json())
    .then(res => {
        document.getElementById("dados").innerHTML += "<br><h4>Fraude: " + res + "</h4>";
    })

    document.getElementById("nome").innerHTML = localStorage.getItem("nome_selecionado");
    document.getElementById("qnt_transacoes").innerHTML = localStorage.getItem("qnt_transacoes");


}

function filtrar() {
    localStorage.setItem("id_selecionado", document.getElementById("mtb310_ag_financeiro").options[document.getElementById("mtb310_ag_financeiro").selectedIndex].value);
    localStorage.setItem("nome_selecionado", document.getElementById("mtb310_ag_financeiro").options[document.getElementById("mtb310_ag_financeiro").selectedIndex].text);
    localStorage.setItem("qnt_transacoes", document.getElementById("mtb310_ag_financeiro").options[document.getElementById("mtb310_ag_financeiro").selectedIndex].getAttribute("transacoes"));
    window.location = "dashboard.html"
}


function logoff() {
    localStorage.removeItem("userlogado");
    window.location = "login.html"
}


function exibirparceiros() {
    fetch("http://localhost:8080/AgFinanceiro")
        .then(res => res.json())
        .then(res => {
            var resposta = "";
            var resposta1 = "<table border='1' align='center' width='80%' style='font:8px'>" +
                "<tr>" +
                "<th>Parceiro</th> <th>Volume Transacional</th>" +
                "</tr>";
            for (contador = 0; contador < res.length; contador++) {
                resposta +=
                    "<option value='" + res[contador].id_agente + "' transacoes='" + res[contador].volume_transacional + "'>" + res[contador].nome_agente + "</option>";
                resposta1 +=
                    "<tr>" +
                    "<td>" + res[contador].nome_agente + "</td>" +
                    "<td>" + res[contador].volume_transacional + "</td>"
                "</tr>";
            }
            document.getElementById("mtb310_ag_financeiro").innerHTML = resposta;
            document.getElementById("tabela_transacional").innerHTML = resposta1;



        })
        .catch(err => {
            window.alert(res.json());
            window.alert("Sem agente financeiro")
        });
}

function exibirusuario() {
    exibirparceiros();
    var userstr = localStorage.getItem("userlogado");
    if (userstr == null) {
        window.location = "login.html";
    } else {
        var userjson = JSON.parse(userstr);
        document.getElementById("dados").innerHTML =
            "<h6>Nome: " + userjson.nome_usuario + "<br>E-mail: " + userjson.email + "<br>RACF     : " + userjson.racf + "</h6>";
    }
}

function logar() {

    var usuario = {
        email: document.getElementById("txtemail").value,
        senha: document.getElementById("txtsenha").value,
        racf: document.getElementById("txtemail").value


    };

    var teste = usuario.email;

    var envelope = {
        method: "POST",
        body: JSON.stringify(usuario),
        headers: {
            "content-type": "application/json"
        }
    };

    if (teste.indexOf("@") == -1) {

        fetch("http://localhost:8080/loginRacf", envelope)
            .then(res => res.json())
            .then(res => {
                localStorage.setItem("userlogado", JSON.stringify(res));
                window.location = "agentesfinanceiros.html";
            })
            .catch(err => {
                window.alert("Usuário e/ou senha inválido(s)");
            });
    }

    else {
        fetch("http://localhost:8080/loginEmail", envelope)
            .then(res => res.json())
            .then(res => {
                localStorage.setItem("userlogado", JSON.stringify(res));
                window.location = "agentesfinanceiros.html";
            })
            .catch(err => {
                window.alert("Usuário e/ou senha inválido(s)");
            });
    }


}





