const API_URL = 'http://localhost:8080/produtos';

async function carregarProdutos() {
  const response = await fetch(API_URL);
  const produtos = await response.json();

  const produtosDiv = document.getElementById('produtos');
  produtos.forEach(produto => {
    const div = document.createElement('div');
    div.classList.add('produto');

    div.innerHTML = `
      <img src="img/${produto.imagem}" alt="${produto.nome}">
      <h3>${produto.nome}</h3>
      <p>Categoria: ${produto.categoria}</p>
      <p>R$ ${produto.preco.toFixed(2)}</p>
    `;

    produtosDiv.appendChild(div);
  });
}

carregarProdutos();