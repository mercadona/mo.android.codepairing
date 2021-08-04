package es.mercadona.codepairing

import android.support.test.runner.AndroidJUnit4
import es.mercadona.codepairing.Area.DESIGN
import es.mercadona.codepairing.Area.ENGINEERING
import es.mercadona.codepairing.Area.PRODUCT
import es.mercadona.codepairing.Role.CODER
import es.mercadona.codepairing.Role.DESIGNER
import es.mercadona.codepairing.Role.PRODUCT_MANAGER

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import java.lang.ref.WeakReference

@RunWith(AndroidJUnit4::class)
class MemberListPresenterTest {
    private val view = MemberListViewSpy()
    private val presenter = MemberListPresenter(WeakReference(view), MemberListRepository())

    @Before
    fun setUp() {
        presenter.onCreateView()
    }
}
