package es.mercadona.codepairing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_member_list.*
import java.lang.ref.WeakReference

class MemberListActivity : AppCompatActivity(), MemberListView {

    private lateinit var presenter: MemberListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_member_list)

        presenter = MemberListPresenter(WeakReference(this), MemberListRepository())
        memberRecyclerView.layoutManager = LinearLayoutManager(this)
        memberRecyclerView.adapter = MemberListAdapter(presenter, this)

        rawButton.setOnClickListener { presenter.sortChangedTo(SearchOption.RAW) }
        productivityButton.setOnClickListener { presenter.sortChangedTo(SearchOption.PRODUCTIVITY) }
        productivityAndAreaButton.setOnClickListener { presenter.sortChangedTo(SearchOption.PRODUCTIVITY_GROUPED_BY_AREA) }

        presenter.onCreateView()
    }

    override fun reload() {
        memberRecyclerView.adapter.notifyDataSetChanged()
    }
}
