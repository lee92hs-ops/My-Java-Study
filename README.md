# Java Programming & Web Development Learning Records
**キャルITカレッジ（CAL IT College） Javaプログラミング科 学習成果物**

本リポジトリは、Javaの基礎文法からオブジェクト指向、さらにはSpring Bootを用いたWebアプリケーション開発までの学習過程と演습課題をまとめたものです。

---

## 1. 学習カリキュラムの概要
Javaの基本構文から始まり、実務で不可欠なオブジェクト指向設計、フレームワークを用いたエンタープライズ開発までを段階的に習得しました。

### **【基礎・応用演習】 Java言語の習得**
教科書（スッキリわかるJava入門等）に基づき、以下の各章の概念理解とコード実装を行いました。

- **第1章〜第6章**: プログラムの基本構造、式と演算子、制御構文、配列、メソッド、複数クラスによる開発
- **第7章〜第13章 (オブジェクト指向深掘り)**: 
    - インスタンスとクラス、継承、多態性（Polymorphism）、カプセル化
    - **成果物フォルダ**: `print11` (高度な継承), `print12` (多態性), `print13` (カプセル化)
- **第14章〜第18章 (標準クラス・高度な機能)**: 
    - 文字列・日付操作、コレクション、例外処理
    - **成果物フォルダ**: `print7_1_日付`, `print 8` (コレクション), `sukkiri`

### **【実戦プロジェクト】 Webアプリケーション開発 (webapp-1)**
学習の集大成として、モダンなスタックを用いたWebアプリケーションを構築しました。

- **プロジェクト名**: `webapp-1` (ToDo管理システム)
- **主要技術**: Spring Boot 3.x, Spring Security, MyBatis, Thymeleaf
- **設計思想**: 
    - **Layered Architecture**: Controller-Service-Repository 分離による疎結合な設計。
    - **Security**: BCryptによるパスワード暗号化と認可制御。
    - **Persistence**: MyBatis XML MapperによるSQL管理の最適化。

---

## 2. 技術スタック (Overall Stack)
- **Languages**: Java 17
- **Frameworks**: Spring Boot 3.x, Spring Security
- **Database**: H2 Database / MySQL (MyBatis 連携)
- **View**: Thymeleaf, HTML/CSS
- **Tools**: Gradle, Eclipse (Pleiades), Git

---

## 3. ディレクトリ構成と学習内容の対応
| フォルダ名 | 対応する学習内容 / チャプター |
| :--- | :--- |
| `webapp-1` | Spring Boot + MyBatis Webアプリケーション（総合演習） |
| `print11` | 第11章 高度な継承（抽象クラス・インターフェース） |
| `print12` | 第12章 多態性（ポリモフィズム） |
| `print13` | 第13章 カプセル化（Getter/Setter, アクセス制限） |
| `print 8` | 第16章 コレクションフレームワーク（List, Map, Set） |
| `MyBatisSample` | MyBatis フレームワークの基礎利用方法 |
| `ValidationSample` | Bean Validationによる入力チェック実装 |
