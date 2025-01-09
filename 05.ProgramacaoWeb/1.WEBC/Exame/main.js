const produtos = document.querySelector("#produtos")

function carregarCategorias() {
    document.addEventListener("DOMContentLoaded", () => {
      fetch("https://dummyjson.com/products/categories")
        .then((response) => {
          if (response.ok) {
            return response.json();
          }
        })
        .then((data) => {
          data.forEach((categoria) => {
            const link = document.createElement("a");
            link.href = "#";
            link.classList.add("categoria-link");
            link.textContent = categoria.name;
            link.dataset.slug = categoria.slug; // Guardar o slug no atributo 'data-slug'
            link.addEventListener("click", (event) => {
              event.preventDefault();
              carregarProdutos(categoria);
            });
            categorias.appendChild(link);
          });
        });
    });
  }
   
  function carregarProdutos(categoria) {
    fetch(`https://dummyjson.com/products/category/${categoria.slug}`)
      .then((response) => {
        if (response.ok) {
          return response.json();
        }
      })
      .then((data) => {
        produtos.innerHTML = "";
        data.products.forEach((produto) => {
          const card = document.createElement("div");
          card.classList.add("card");
          card.innerHTML = `
                      <div class="card-body">
                          <h5 class="card-title">${produto.title}</h5>
                          <p class="card-text">Price: $${produto.price}</p>
                          <p class="card-text">Rating: ${produto.rating}/5</p>
                      </div>
                  `;
          produtos.appendChild(card);
        });
      });
  }
   
  carregarCategorias();
  carregarProdutos();
