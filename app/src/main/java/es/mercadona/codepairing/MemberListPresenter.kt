package es.mercadona.codepairing

import java.lang.ref.WeakReference

class MemberListPresenter(
    private val view: WeakReference<MemberListView>,
    private val repository: MemberListRepository
) {

    private var members: List<Member> = listOf()

    val totalSalary: Double = 0.0

    val memberCount: Int
        get() = members.size

    fun onCreateView() {
        sortChangedTo(SearchOption.RAW)
    }

    fun memberAt(position: Int) = members[position]

    fun sortChangedTo(option: SearchOption) {
        members = repository.fetch()
        view.get()?.reload()
    }
}


enum class SearchOption {
    RAW,
    PRODUCTIVITY,
    PRODUCTIVITY_GROUPED_BY_AREA;
}