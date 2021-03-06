
/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.common.mithra.connectionmanager;

import java.sql.Connection;
import java.util.TimeZone;

import com.gs.fw.common.mithra.bulkloader.BulkLoader;
import com.gs.fw.common.mithra.bulkloader.BulkLoaderException;
import com.gs.fw.common.mithra.databasetype.DatabaseType;


public interface ObjectSourceConnectionManager
{

    BulkLoader createBulkLoader(Object sourceAttribute) throws BulkLoaderException;
    Connection getConnection(Object sourceAttribute);
    DatabaseType getDatabaseType(Object sourceAttribute);
    TimeZone getDatabaseTimeZone(Object sourceAttribute);
    String getDatabaseIdentifier(Object sourceAttribute);
}
