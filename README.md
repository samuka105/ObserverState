# Padrões State e Observer

Exemplo que integra dois padrões comportamentais no ciclo de vida de um pedido.
O pedido muda de estado (Novo, Pago, Enviado, Entregue, Cancelado) usando o
padrão **State**, e cada transição válida dispara uma notificação aos
interessados (cliente e central de logística) usando o padrão **Observer**.


## Conteúdo do repositório

- **Código-fonte** integrando os padrões State e Observer (ciclo de vida de pedido com notificações).
- **Casos de teste** (JUnit) cobrindo a notificação na transição, a transição inválida sem notificação e o fluxo com vários observadores.
- **Diagrama UML** das classes, em formato de imagem.
