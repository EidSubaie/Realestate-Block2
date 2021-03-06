import {Component, Input} from '@angular/core';
import {NgbDateStruct} from '@ng-bootstrap/ng-bootstrap';

@Component({
	selector: 'app-datepicker-customday',
	templateUrl: './datepicker6.component.html',
	styles: [`
		.custom-day {
			text-align: center;
			padding: 0.185rem 0.25rem;
			border-radius: 0.25rem;
			display: inline-block;
			width: 2rem;
		}

		.custom-day:hover, .custom-day.focused {
			background-color: #e6e6e6;
		}

		.weekend {
			background-color: #f0ad4e;
			border-radius: 1rem;
			color: white;
		}

		.hidden {
			display: none;
		}
	`]
})
export class Datepicker6Component {
	model: NgbDateStruct;

	isWeekend(date: NgbDateStruct) {
		const d = new Date(date.year, date.month - 1, date.day);
		return d.getDay() === 0 || d.getDay() === 6;
	}

	isDisabled(date: NgbDateStruct, current: {month: number}) {
		return date.month !== current.month;
	}
}
