/**
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

package brix.plugin.site.page.tile.admin;

import org.apache.wicket.model.IModel;

import brix.web.generic.IGenericComponent;

public abstract class GenericTileEditorPanel<T> extends TileEditorPanel implements IGenericComponent<T>
{

	public GenericTileEditorPanel(String id)
	{
		super(id);
	}

	public GenericTileEditorPanel(String id, IModel<?> model)
	{
		super(id, model);
	}

	@SuppressWarnings("unchecked")
	public final IModel<T> getModel()
	{
		return (IModel<T>) getDefaultModel();
	}

	@SuppressWarnings("unchecked")
	public final T getModelObject()
	{
		return (T) getDefaultModelObject();
	}

	public final void setModel(IModel<T> model)
	{
		setDefaultModel(model);
	}

	public final void setModelObject(T object)
	{
		setDefaultModelObject(object);
	}

}
