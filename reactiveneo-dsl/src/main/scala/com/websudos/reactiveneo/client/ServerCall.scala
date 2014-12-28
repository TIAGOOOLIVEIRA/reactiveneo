/*
 * Copyright 2014 websudos ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.websudos.reactiveneo.client

import scala.concurrent.Future

/**
 * Abstraction of communication with a server. The idea of this trait is to represent fully initialized definition of
 * server call statement.
 *
 * @tparam RT type of server response
 */
trait ServerCall[RT] {

  def execute(): Future[RT]

}