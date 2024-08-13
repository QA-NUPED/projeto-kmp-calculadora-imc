# Projeto kmp-calculadora-imc

Projeto básico de uma calculadora de IMC para aprendizado do KMP e criação de testes unitários.

## Arquitetura do Projeto
```
├── resources
│   ├── Kotlin
│   ├── AndroidApp
│   │       └── src/main
│   │           └── java/com/example/androidApp
│   │           └── res
│   ├── gradle
│   ├── iosApp
│   │   ├── iosApp.xcodeproj
│   │   ├── project.xcworkspace
│   ├── Shared
│   │       └── src
│   │           └── androidMain/kotlin/com/example/bmi
│   │           └── androidUnitTest/kotlin/com/example/bmi
│   │           └── commonMain/kotlin/com/example/bmi
│   │           └── commonTest/kotlin/com/example/bmi
│   │           └── iosMain/kotlin/com/example/bmi
│   │           └── iosTest/kotlin/com/example/bmi
├── .gitignore
├── README.md
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## O que preciso fazer antes de rodar o projeto?

Precisamos ter algumas ferramentas instaladas na máquina. Segue o vídeo abaixo para auxiliar na configuração.

Tutorial: Guia definitivo de como instalar e usar o Kotlin Multiplatform na sua máquina - https://www.youtube.com/watch?v=k1I8-qBVGEc 
Tutorial: Kotlin Multiplataforma (KMP): Criando um App nativo para Android e iOS com Kotlin - https://www.youtube.com/watch?v=k1I8-qBVGEc

### Ferramentas

- Android Studio
- Xcode
- Homebrew
- KDoctor
- CocoaPods

## Testes unitários

Testes unitários são uma parte fundamental do desenvolvimento de software, pois garantem que pequenas partes do código (as unidades) funcionem corretamente de forma isolada. No contexto de um projeto usando Kotlin Multiplatform (KMP), a criação de testes unitários é especialmente importante, pois permite que você garanta a funcionalidade e a estabilidade do código que é compartilhado entre diferentes plataformas, como Android e iOS.

Importância dos Testes Unitários em KMP
Garantia de Qualidade: Testes unitários ajudam a identificar problemas no código antes que eles sejam integrados em um sistema maior. Isso é crucial em projetos multiplataforma, onde uma falha em um módulo compartilhado pode impactar várias plataformas.

Facilidade de Manutenção: Com testes unitários bem escritos, você pode modificar o código com confiança. Se algo quebrar, os testes fornecerão feedback imediato, indicando onde está o problema.

Reutilização de Código: No KMP, grande parte do código é compartilhada entre Android e iOS. Escrever testes unitários para esse código compartilhado garante que as mesmas funcionalidades se comportem da mesma maneira em ambas as plataformas.

Evolução do Projeto: Testes unitários permitem refatorar o código existente ou adicionar novas funcionalidades sem medo de introduzir novos bugs.

### Como Criar Testes Unitários em KMP

Configuração do Ambiente:

No arquivo build.gradle.kts, certifique-se de que as dependências de testes estejam configuradas corretamente para a parte comum (commonMain) e para as partes específicas de cada plataforma (androidMain e iosMain).
Você pode usar frameworks de testes como Kotlin Test para escrever testes comuns que serão executados tanto no Android quanto no iOS.
Escrita dos Testes:

Crie uma pasta de testes no módulo comum, por exemplo, src/commonTest/kotlin.
Dentro dessa pasta, crie classes de teste para as funcionalidades que deseja validar.
Use as funções de asserção padrão, como assertEquals, assertTrue, etc., para verificar se os resultados são os esperados.

## Resumo do projeto

Um projeto em Kotlin Multiplatform (KMP) para Android e iOS consiste em desenvolver uma aplicação que compartilha a lógica de negócios, a manipulação de dados e outras funcionalidades comuns entre as duas plataformas, utilizando Kotlin como linguagem principal. A ideia central é escrever o código uma única vez e reutilizá-lo tanto em aplicativos Android quanto iOS, reduzindo o esforço de desenvolvimento e manutenção.

No KMP, você cria módulos multiplataforma, onde a maior parte do código é comum, e módulos específicos para Android e iOS, onde é necessário acessar APIs nativas ou realizar implementações específicas para cada plataforma. A interface do usuário, por exemplo, geralmente é implementada separadamente para cada plataforma, enquanto a lógica de negócio, como cálculos, validação de dados, e comunicação com APIs, pode ser compartilhada.

Em um projeto de calculadora de IMC (Índice de Massa Corporal), por exemplo, a lógica para calcular o IMC e as regras de classificação seriam escritas no código compartilhado. Já a interface gráfica seria implementada separadamente utilizando as ferramentas e frameworks específicos de Android (como Jetpack Compose) e iOS (como SwiftUI).

A vantagem do KMP é permitir que desenvolvedores possam aproveitar ao máximo as particularidades de cada plataforma, ao mesmo tempo em que reduzem a duplicação de código e facilitam a consistência entre os aplicativos.
  
