console.log("JavaScript carregado!");
// Localiza o formulário na página
const formTarefa = document.getElementById("formTarefa");

// Localiza a área onde as tarefas serão exibidas
const listaTarefas = document.getElementById("listaTarefas");
// Captura o envio do formulário
formTarefa.addEventListener("submit", async function(event) {

    event.preventDefault();

    // Captura os valores dos campos
    const tarefa = {
        nome: document.getElementById("nome").value,
        descricao: document.getElementById("descricao").value,
        realizado: false,
        prioridade: document.getElementById("prioridade").value
    };

    // Envia a tarefa para a API
    const resposta = await fetch("/tarefas", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(tarefa)
    });

    // Verifica se o cadastro foi realizado
    if (resposta.ok) {

        alert("Tarefa cadastrada com sucesso!");

        formTarefa.reset();

        carregarTarefas();

    } else {

        const mensagem = await resposta.text();

        alert(mensagem);

    }

});

// Busca todas as tarefas cadastradas na API
async function carregarTarefas() {

    const resposta = await fetch("/tarefas");

    const tarefas = await resposta.json();

    listaTarefas.innerHTML = "";

    tarefas.forEach(tarefa => {

        const div = document.createElement("div");

        div.innerHTML = `
            <h3>${tarefa.nome}</h3>

            <p>${tarefa.descricao || "Sem descrição"}</p>

            <p>Prioridade: ${tarefa.prioridade}</p>

            <p>Situação: ${tarefa.realizado ? "Concluída" : "Pendente"}</p>
        `;

        listaTarefas.appendChild(div);

    });

}
window.carregarTarefas = carregarTarefas;
carregarTarefas();