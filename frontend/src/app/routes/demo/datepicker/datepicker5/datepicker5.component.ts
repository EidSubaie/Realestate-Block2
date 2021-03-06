import {Component, Injectable} from '@angular/core';
import {NgbDateAdapter, NgbDateStruct} from '@ng-bootstrap/ng-bootstrap';

/**
 * Example of a Native Date adapter
 */
@Injectable()
export class NgbDateNativeAdapter extends NgbDateAdapter<Date> {

	fromModel(date: Date): NgbDateStruct {
		return (date && date.getFullYear) ? {year: date.getFullYear(), month: date.getMonth() + 1, day: date.getDate()} : null;
	}

	toModel(date: NgbDateStruct): Date {
		return date ? new Date(date.year, date.month - 1, date.day) : null;
	}
}

@Component({
	selector: 'app-datepicker-adapter',
	templateUrl: './datepicker5.component.html',

	// NOTE: For this example we are only providing current component, but probably
	// NOTE: you will want to provide your main App Module
	providers: [{provide: NgbDateAdapter, useClass: NgbDateNativeAdapter}]
})
export class Datepicker5Component {

	model1: Date;
	model2: Date;

	get today() {
		return new Date();
	}
}
