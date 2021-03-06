/* 
 * Copyright (C) 2016 European Forest Institute
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package efi.efiscen.database;

/**
 * Type of database driver. Currently supported types are Odbc, MySql or 
 * PostgreSQL. Odbc driver can be used to connect to Microsoft Access, MySQL or
 * PostgreSQL databases. In case JDBC -driver is used, MySQL and PostgreSQL 
 * driver types can be used.
 * 
 */
 public enum DriverType {
    None(""), Odbc("\""), MySql("`"), PostgreSQL("\"");
    //String to quote field names in the insert and update statements
    public final String quote;
    //
    private DriverType(String qu) {
        this.quote = qu;
    }
}
