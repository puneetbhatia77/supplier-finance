import { InvoiceNumberFormatPipe } from './invoice-number-format.pipe';

describe('InvoiceNumberFormatPipe', () => {
  it('create an instance', () => {
    const pipe = new InvoiceNumberFormatPipe();
    expect(pipe).toBeTruthy();
  });
});