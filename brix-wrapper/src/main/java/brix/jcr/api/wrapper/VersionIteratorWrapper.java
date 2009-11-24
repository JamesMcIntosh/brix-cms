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

package brix.jcr.api.wrapper;

import javax.jcr.version.Version;
import javax.jcr.version.VersionIterator;

import brix.jcr.api.JcrSession;
import brix.jcr.api.JcrVersion;
import brix.jcr.api.JcrVersionIterator;

/**
 * 
 * @author Matej Knopp
 */
class VersionIteratorWrapper extends RangeIteratorWrapper implements JcrVersionIterator
{

    public VersionIteratorWrapper(VersionIterator delegate, JcrSession session)
    {
        super(delegate, session);
    }

    public static JcrVersionIterator wrap(VersionIterator delegate, JcrSession session)
    {
        if (delegate == null)
            return null;
        else
            return new VersionIteratorWrapper(delegate, session);
    }

    @Override
    public VersionIterator getDelegate()
    {
        return (VersionIterator)super.getDelegate();
    }

    public JcrVersion nextVersion()
    {
        return JcrVersion.Wrapper.wrap(getDelegate().nextVersion(), getJcrSession());
    }

    @Override
    public Object next()
    {
        return JcrVersion.Wrapper.wrap((Version)getDelegate().next(), getJcrSession());
    }
}
