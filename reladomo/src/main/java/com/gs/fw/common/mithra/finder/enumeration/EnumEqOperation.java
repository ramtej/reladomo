
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

package com.gs.fw.common.mithra.finder.enumeration;

import com.gs.fw.common.mithra.attribute.EnumAttribute;
import com.gs.fw.common.mithra.extractor.Extractor;
import com.gs.fw.common.mithra.finder.NonPrimitiveEqOperation;

public class EnumEqOperation<E extends Enum<E>> extends NonPrimitiveEqOperation
{

    public EnumEqOperation(EnumAttribute attribute, E parameter)
    {
        super(attribute, parameter);
    }
    @Override
    protected Extractor getStaticExtractor()
    {
        throw new RuntimeException("Not implemented");
    }
}
