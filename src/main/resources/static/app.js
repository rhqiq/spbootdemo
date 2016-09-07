'use strict';

// tag::vars[]
const React = require('react');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {contacts: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/contacts'}).done(response => {
			this.setState({contacts: response.entity._embedded.contacts});
		});
	}

	render() {
		return (
			<ContactList contacts={this.state.contacts}/>
		)
	}
}
// end::app[]

// tag::contact-list[]
class ContactList extends React.Component{
	render() {
		var contacts = this.props.contacts.map(contact =>
			<Contact key={contact._links.self.href} contact={contact}/>
		);
		return (
			<table>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Profession</th>
				</tr>
				{contacts}
			</table>
		)
	}
}
// end::contact-list[]

// tag::contact[]
class Contact extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.contact.name}</td>
				<td>{this.props.contact.email}</td>
				<td>{this.props.contact.profession}</td>
			</tr>
		)
	}
}
// end::contact[]

// tag::render[]
React.render(
	<App />,
	document.getElementById('react')
)
// end::render[]

