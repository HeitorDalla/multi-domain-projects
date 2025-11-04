# 📘 Projeto de Infraestrutura com Vagrant

Este repositório contém múltiplos ambientes virtualizados utilizando **Vagrant**, permitindo a criação e o gerenciamento automatizado de máquinas virtuais para testes, estudos e provisionamento de infraestrutura.

---

## 📂 Estrutura do Projeto

A organização atual do repositório é a seguinte:

```
├── LAMP
│   └── Vagrantfile
├── baristaIAC
│   └── Vagrantfile
├── centos
│   └── Vagrantfile
├── ubuntu
│   └── Vagrantfile
├── ubuntu-2.0
│   └── Vagrantfile
├── wordpressIAC
│   └── Vagrantfile
├── .gitignore
└── README.md
```

### 🗂️ Descrição dos Ambientes

| Diretório        | Propósito |
|-----------------|-----------|
| **LAMP**        | Ambiente com Linux, Apache, MySQL e PHP para desenvolvimento web. |
| **baristaIAC**  | Infraestrutura como Código com provisionamento automatizado. |
| **centos**      | Máquina virtual base para testes com CentOS. |
| **ubuntu**      | Máquina virtual baseada em Ubuntu para estudos gerais. |
| **ubuntu-2.0**  | Versão alternativa do ambiente Ubuntu com ajustes evolutivos. |
| **wordpressIAC**| Configuração automatizada de um ambiente WordPress. |

---

## 📌 Pré-requisitos

Antes de iniciar, instale:

- [Vagrant](https://www.vagrantup.com/)
- [VirtualBox](https://www.virtualbox.org/) ou outro provider compatível
- Git (opcional)

---

## 🚀 Como Executar um Ambiente

1. Escolha o diretório do ambiente desejado:

```bash
cd <nome_do_diretório>
```

2. Inicie o ambiente:

```bash
vagrant up
```

3. Acesse via SSH:

```bash
vagrant ssh
```

---

## 🧰 Comandos Úteis

| Comando | Função |
|--------|--------|
| `vagrant status` | Verifica o estado da VM |
| `vagrant halt` | Desliga a VM |
| `vagrant destroy -f` | Remove a VM completamente |
| `vagrant reload` | Reinicia a VM aplicando mudanças |
| `vagrant provision` | Executa novamente o provisionamento |

---

## 🎯 Objetivo do Projeto

Este repositório tem como foco:

✅ Prática com Infraestrutura como Código (IaC)  
✅ Automação de ambientes virtualizados  
✅ Estudos e experimentação com Vagrant  
✅ Padronização de ambientes de desenvolvimento  

---

## 👥 Contribuições

Contribuições são bem-vindas!  
Crie um *fork*, realize melhorias e abra um *pull request*.

---

## 👤 Autor

**Heitor**  
Projeto desenvolvido para fins educacionais e estudos sobre DevOps, Linux e automação.

---

📌 *Sinta-se livre para modificar ou expandir este repositório com novos ambientes e provisionamentos!*
