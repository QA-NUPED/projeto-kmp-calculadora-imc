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


## Resumo do projeto

Um projeto em Kotlin Multiplatform (KMP) para Android e iOS consiste em desenvolver uma aplicação que compartilha a lógica de negócios, a manipulação de dados e outras funcionalidades comuns entre as duas plataformas, utilizando Kotlin como linguagem principal. A ideia central é escrever o código uma única vez e reutilizá-lo tanto em aplicativos Android quanto iOS, reduzindo o esforço de desenvolvimento e manutenção.

No KMP, você cria módulos multiplataforma, onde a maior parte do código é comum, e módulos específicos para Android e iOS, onde é necessário acessar APIs nativas ou realizar implementações específicas para cada plataforma. A interface do usuário, por exemplo, geralmente é implementada separadamente para cada plataforma, enquanto a lógica de negócio, como cálculos, validação de dados, e comunicação com APIs, pode ser compartilhada.

Em um projeto de calculadora de IMC (Índice de Massa Corporal), por exemplo, a lógica para calcular o IMC e as regras de classificação seriam escritas no código compartilhado. Já a interface gráfica seria implementada separadamente utilizando as ferramentas e frameworks específicos de Android (como Jetpack Compose) e iOS (como SwiftUI).

A vantagem do KMP é permitir que desenvolvedores possam aproveitar ao máximo as particularidades de cada plataforma, ao mesmo tempo em que reduzem a duplicação de código e facilitam a consistência entre os aplicativos.
  
