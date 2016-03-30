/*
 * Copyright jd
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.dtdream.vanyar.robin.mysql.persistent.entity;

/**
 * User: biandi
 * Date: 13-4-16
 * Time: 上午9:49
 */
public class ServiceIdGen {

    private Integer maxId;
    private Integer head;
    private Integer maxHead;
    private Integer idScope;

    public Integer getMaxId() {
        return maxId;
    }

    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getMaxHead() {
        return maxHead;
    }

    public Integer getIdScope() {
        return idScope;
    }
}
