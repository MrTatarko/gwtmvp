/*
 * Copyright 2016 Turn s.r.o.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package sk.turn.gwtmvp.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for methods that reference a HTML element in an accompanying .html file. For example,
 * when an {@code input} element has {@code data-gwtid="nameInput"}, the corresponding {@link View}
 * method would be
 * 
 * <p>
 * <code><pre>@HtmlElement InputElement getNameInput();</pre></code>
 * </p>
 * 
 * <p>
 * If you want to have a different method name, use the annotation value, e.g.
 * <code><pre>@HtmlElement("nameInput") InputElement getName();</pre></code>
 * </p>
 * 
 * @author tomas
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HtmlElement {
  /**
   * Optionally can override the {@code data-gwtid} attribute that the generator searches for, the
   * ID is automatically generated from method name by default.
   * 
   * @return The {@code data-gwtid} of the element that should map to this method. If omitted the ID
   *         is generated from the method name.
   */
  String value() default "";
}
