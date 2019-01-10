package es.mercadona.codepairing

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_member.view.*

class MemberListAdapter(private val presenter: MemberListPresenter, private val context: Context) :
    RecyclerView.Adapter<MemberListAdapter.ViewHolder>() {

    override fun getItemCount() = presenter.memberCount

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_member, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = presenter.memberAt(position)

        with(holder) {
            areaView.setBackgroundColor(member.area.color)
            nameTextView.text = member.name
            roleTextView.text = member.role.toString()
            productivityTextView.text = "x${member.productivity}"
        }
    }

    class ViewHolder(itemMember: View) : RecyclerView.ViewHolder(itemMember) {
        val areaView = itemMember.areaView as View
        val nameTextView = itemMember.nameTextView as TextView
        val roleTextView = itemMember.roleTextView as TextView
        val productivityTextView = itemMember.productivityTextView as TextView
    }
}