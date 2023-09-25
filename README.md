# SymphogearTest

## 概要
SymphogearTestは、シンフォギア奏者のデータベースを管理するWebアプリケーションです。ユーザーは新規奏者を登録し、既存の奏者を検索、編集、削除できます。アプリケーションはJavaとSpring Bootを使用して開発され、データベースとしてMySQLを利用しています。

## 主要な機能
- 新規奏者登録
- 奏者検索
- 全奏者リスト表示
- 奏者情報編集
- 奏者情報削除

## 技術スタック
- 開発言語: Java
- フレームワーク: Spring Boot
- テンプレートエンジン: Thymeleaf
- データベース: MySQL
- ORM: MyBatis

## クラス構成
- `SymphogearTestApplication`: アプリケーションのエントリーポイント
- `UserController`: ユーザー関連の操作をコントロール
- `UserService`: ユーザー関連のビジネスロジックを処理
- `UserMapper`: データベース操作を行う
- `User`: ユーザー（シンフォギア奏者）のエンティティクラス
- `UserSearchRequest`: ユーザー検索のためのリクエストデータ

## データベース構成
- テーブル名: symphogear_players
  - id: 奏者のID
  - name: 奏者の名前
  - symphogear_name: シンフォギアの名前

## テンプレート
- `top.html`: 新規登録、奏者検索、全奏者リストへのリンクを提供
- `player_search.html`: 奏者の検索と検索結果の表示を行う
- `list.html`: 全奏者のリストを表示
- `add_player.html`: 新規奏者の登録フォームを提供
- `add_comp.html`: 新規奏者の登録完了画面を表示
- `edit.html`: 奏者情報の編集完了画面を表示
- `conf_player.html`: 奏者情報の編集フォームを提供
- `delete.html`: 奏者情報の削除完了画面を表示
