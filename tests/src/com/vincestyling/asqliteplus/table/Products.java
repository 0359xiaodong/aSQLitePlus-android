/**
 * Copyright (C) 2015 Vince Styling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vincestyling.asqliteplus.table;

import com.vincestyling.asqliteplus.DBOperator;
import com.vincestyling.asqliteplus.entity.Product;
import com.vincestyling.asqliteplus.statement.CreateStatement;

import java.util.ArrayList;
import java.util.List;

public class Products extends Table {
    public static final String TABLE_NAME = "Products";
    public static final String PRODUCT_ID = "product_id";
    public static final String PRODUCT_NAME = "product_name";
    public static final String SUPPLIER_ID = "supplier_id";
    public static final String CATEGORY_ID = "category_id";
    public static final String UNIT = "unit";
    public static final String PRICE = "price";

    public static CharSequence buildColumnDeclarations() {
        return concatColumns(
                PRODUCT_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT",
                PRODUCT_NAME + " VARCHAR(255)",
                SUPPLIER_ID + " INT",
                CATEGORY_ID + " INT",
                UNIT + " VARCHAR(255)",
                PRICE + " REAL");
    }

    public final static List<Product> INIT_DATAS = new ArrayList<Product>();

    static {
        INIT_DATAS.add(new Product(1, "Chais", 1, 1, "10 boxes x 20 bags", 18));
        INIT_DATAS.add(new Product(2, "Chang", 1, 1, "24 - 12 oz bottles", 19));
        INIT_DATAS.add(new Product(3, "Aniseed Syrup", 1, 2, "12 - 550 ml bottles", 10));
        INIT_DATAS.add(new Product(4, "Chef Anton\'s Cajun Seasoning", 2, 2, "48 - 6 oz jars", 22));
        INIT_DATAS.add(new Product(5, "Chef Anton\'s Gumbo Mix", 2, 2, "36 boxes", 21.35));
        INIT_DATAS.add(new Product(6, "Grandma\'s Boysenberry Spread", 3, 2, "12 - 8 oz jars", 25));
        INIT_DATAS.add(new Product(7, "Uncle Bob\'s Organic Dried Pears", 3, 7, "12 - 1 lb pkgs.", 30));
        INIT_DATAS.add(new Product(8, "Northwoods Cranberry Sauce", 3, 2, "12 - 12 oz jars", 40));
        INIT_DATAS.add(new Product(9, "Mishi Kobe Niku", 4, 6, "18 - 500 g pkgs.", 97));
        INIT_DATAS.add(new Product(10, "Ikura", 4, 8, "12 - 200 ml jars", 31));
        INIT_DATAS.add(new Product(11, "Queso Cabrales", 5, 4, "1 kg pkg.", 21));
        INIT_DATAS.add(new Product(12, "Queso Manchego La Pastora", 5, 4, "10 - 500 g pkgs.", 38));
        INIT_DATAS.add(new Product(13, "Konbu", 6, 8, "2 kg box", 6));
        INIT_DATAS.add(new Product(14, "Tofu", 6, 7, "40 - 100 g pkgs.", 23.25));
        INIT_DATAS.add(new Product(15, "Genen Shouyu", 6, 2, "24 - 250 ml bottles", 15.5));
        INIT_DATAS.add(new Product(16, "Pavlova", 7, 3, "32 - 500 g boxes", 17.45));
        INIT_DATAS.add(new Product(17, "Alice Mutton", 7, 6, "20 - 1 kg tins", 39));
        INIT_DATAS.add(new Product(18, "Carnarvon Tigers", 7, 8, "16 kg pkg.", 62.5));
        INIT_DATAS.add(new Product(19, "Teatime Chocolate Biscuits", 8, 3, "10 boxes x 12 pieces", 9.2));
        INIT_DATAS.add(new Product(20, "Sir Rodney\'s Marmalade", 8, 3, "30 gift boxes", 81));
        INIT_DATAS.add(new Product(21, "Sir Rodney\'s Scones", 8, 3, "24 pkgs. x 4 pieces", 10));
        INIT_DATAS.add(new Product(22, "Gustaf\'s Knäckebröd", 9, 5, "24 - 500 g pkgs.", 21));
        INIT_DATAS.add(new Product(23, "Tunnbröd", 9, 5, "12 - 250 g pkgs.", 9));
        INIT_DATAS.add(new Product(24, "Guaraná Fantástica", 10, 1, "12 - 355 ml cans", 4.5));
        INIT_DATAS.add(new Product(25, "NuNuCa Nuß-Nougat-Creme", 11, 3, "20 - 450 g glasses", 14));
        INIT_DATAS.add(new Product(26, "Gumbär Gummibärchen", 11, 3, "100 - 250 g bags", 31.23));
        INIT_DATAS.add(new Product(27, "Schoggi Schokolade", 11, 3, "100 - 100 g pieces", 43.9));
        INIT_DATAS.add(new Product(28, "Rössle Sauerkraut", 12, 7, "25 - 825 g cans", 45.6));
        INIT_DATAS.add(new Product(29, "Thüringer Rostbratwurst", 12, 6, "50 bags x 30 sausgs.", 123.79));
        INIT_DATAS.add(new Product(30, "Nord-Ost Matjeshering", 13, 8, "10 - 200 g glasses", 25.89));
        INIT_DATAS.add(new Product(31, "Gorgonzola Telino", 14, 4, "12 - 100 g pkgs", 12.5));
        INIT_DATAS.add(new Product(32, "Mascarpone Fabioli", 14, 4, "24 - 200 g pkgs.", 32));
        INIT_DATAS.add(new Product(33, "Geitost", 15, 4, "500 g", 2.5));
        INIT_DATAS.add(new Product(34, "Sasquatch Ale", 16, 1, "24 - 12 oz bottles", 14));
        INIT_DATAS.add(new Product(35, "Steeleye Stout", 16, 1, "24 - 12 oz bottles", 18));
        INIT_DATAS.add(new Product(36, "Inlagd Sill", 17, 8, "24 - 250 g jars", 19));
        INIT_DATAS.add(new Product(37, "Gravad lax", 17, 8, "12 - 500 g pkgs.", 26));
        INIT_DATAS.add(new Product(38, "Côte de Blaye", 18, 1, "12 - 75 cl bottles", 263.5));
        INIT_DATAS.add(new Product(39, "Chartreuse verte", 18, 1, "750 cc per bottle", 18));
        INIT_DATAS.add(new Product(40, "Boston Crab Meat", 19, 8, "24 - 4 oz tins", 18.4));
        INIT_DATAS.add(new Product(41, "Jack\'s New England Clam Chowder", 19, 8, "12 - 12 oz cans", 9.65));
        INIT_DATAS.add(new Product(42, "Singaporean Hokkien Fried Mee", 20, 5, "32 - 1 kg pkgs.", 14));
        INIT_DATAS.add(new Product(43, "Ipoh Coffee", 20, 1, "16 - 500 g tins", 46));
        INIT_DATAS.add(new Product(44, "Gula Malacca", 20, 2, "20 - 2 kg bags", 19.45));
        INIT_DATAS.add(new Product(45, "Røgede sild", 21, 8, "1k pkg.", 9.5));
        INIT_DATAS.add(new Product(46, "Spegesild", 21, 8, "4 - 450 g glasses", 12));
        INIT_DATAS.add(new Product(47, "Zaanse koeken", 22, 3, "10 - 4 oz boxes", 9.5));
        INIT_DATAS.add(new Product(48, "Chocolade", 22, 3, "10 pkgs.", 12.75));
        INIT_DATAS.add(new Product(49, "Maxilaku", 23, 3, "24 - 50 g pkgs.", 20));
        INIT_DATAS.add(new Product(50, "Valkoinen suklaa", 23, 3, "12 - 100 g bars", 16.25));
        INIT_DATAS.add(new Product(51, "Manjimup Dried Apples", 24, 7, "50 - 300 g pkgs.", 53));
        INIT_DATAS.add(new Product(52, "Filo Mix", 24, 5, "16 - 2 kg boxes", 7));
        INIT_DATAS.add(new Product(53, "Perth Pasties", 24, 6, "48 pieces", 32.8));
        INIT_DATAS.add(new Product(54, "Tourtière", 25, 6, "16 pies", 7.45));
        INIT_DATAS.add(new Product(55, "Pâté chinois", 25, 6, "24 boxes x 2 pies", 24));
        INIT_DATAS.add(new Product(56, "Gnocchi di nonna Alice", 26, 5, "24 - 250 g pkgs.", 38));
        INIT_DATAS.add(new Product(57, "Ravioli Angelo", 26, 5, "24 - 250 g pkgs.", 19.5));
        INIT_DATAS.add(new Product(58, "Escargots de Bourgogne", 27, 8, "24 pieces", 13.25));
        INIT_DATAS.add(new Product(59, "Raclette Courdavault", 28, 4, "5 kg pkg.", 55));
        INIT_DATAS.add(new Product(60, "Camembert Pierrot", 28, 4, "15 - 300 g rounds", 34));
        INIT_DATAS.add(new Product(61, "Sirop d\'érable", 29, 2, "24 - 500 ml bottles", 28.5));
        INIT_DATAS.add(new Product(62, "Tarte au sucre", 29, 3, "48 pies", 49.3));
        INIT_DATAS.add(new Product(63, "Vegie-spread", 7, 2, "15 - 625 g jars", 43.9));
        INIT_DATAS.add(new Product(64, "Wimmers gute Semmelknödel", 12, 5, "20 bags x 4 pieces", 33.25));
        INIT_DATAS.add(new Product(65, "Louisiana Fiery Hot Pepper Sauce", 2, 2, "32 - 8 oz bottles", 21.05));
        INIT_DATAS.add(new Product(66, "Louisiana Hot Spiced Okra", 2, 2, "24 - 8 oz jars", 17));
        INIT_DATAS.add(new Product(67, "Laughing Lumberjack Lager", 16, 1, "24 - 12 oz bottles", 14));
        INIT_DATAS.add(new Product(68, "Scottish Longbreads", 8, 3, "10 boxes x 8 pieces", 12.5));
        INIT_DATAS.add(new Product(69, "Gudbrandsdalsost", 15, 4, "10 kg pkg.", 36));
        INIT_DATAS.add(new Product(70, "Outback Lager", 7, 1, "24 - 355 ml bottles", 15));
        INIT_DATAS.add(new Product(71, "Fløtemysost", 15, 4, "10 - 500 g pkgs.", 21.5));
        INIT_DATAS.add(new Product(72, "Mozzarella di Giovanni", 14, 4, "24 - 200 g pkgs.", 34.8));
        INIT_DATAS.add(new Product(73, "Röd Kaviar", 17, 8, "24 - 150 g jars", 15));
        INIT_DATAS.add(new Product(74, "Longlife Tofu", 4, 7, "5 kg pkg.", 10));
        INIT_DATAS.add(new Product(75, "Rhönbräu Klosterbier", 12, 1, "24 - 0.5 l bottles", 7.75));
        INIT_DATAS.add(new Product(76, "Lakkalikööri", 23, 1, "500 ml", 18));
        INIT_DATAS.add(new Product(77, "Original Frankfurter grüne Soße", 12, 2, "12 boxes", 13));
    }

    public final static DBOperator<Product> CREATE_DBOPER = new DBOperator<Product>() {
        @Override
        public Object produce(Product entity) {
            return CreateStatement.produce(TABLE_NAME)
                    .put(PRODUCT_ID, entity.getProductId())
                    .put(PRODUCT_NAME, entity.getProductName())
                    .put(SUPPLIER_ID, entity.getSupplierId())
                    .put(CATEGORY_ID, entity.getCategoryId())
                    .put(UNIT, entity.getUnit())
                    .put(PRICE, entity.getPrice());
        }
    };
}
